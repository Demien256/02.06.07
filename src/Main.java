package src;

import src.notebook.impl.ConsoleNotebookView;
import src.notebook.Notebook;
import src.notebook.NotebookPresenter;
import src.notebook.NotebookView;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Notebook model = new Notebook();
        NotebookView view = new ConsoleNotebookView();
        NotebookPresenter presenter = new NotebookPresenter(
                model,
                view);
        Cli cli = new Cli(presenter);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            cli.showStartMessage();
            int choice = scanner.nextInt();
            cli.handler(choice);
            scanner.nextLine(); // Consume newline

        }
    }
}