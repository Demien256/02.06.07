package src;

import src.notebook.NotebookPresenter;

/**
CLI = Command Line Interface
 **/
public class Cli {
    final NotebookPresenter presenter;

    public Cli(NotebookPresenter presenter){
        this.presenter = presenter;
    }

    public void showStartMessage(){
        System.out.println("1. Add Note");
        System.out.println("2. Show Notes for Day");
        System.out.println("3. Show Notes for Week");
        System.out.println("4. Save Notes");
        System.out.println("5. Load Notes");
        System.out.println("6. Exit");
    }

    public void handler(int choice){
        switch (choice) {
            case 1:
                presenter.addNote();
                break;
            case 2:
                presenter.showNotesForDay();
                break;
            case 3:
                presenter.showNotesForWeek();
                break;
            case 4:
                presenter.saveNotes();
                break;
            case 5:
                presenter.loadNotes();
                break;
            case 6:
                return;
            default:
                System.out.println("Invalid choice");
        }
    }
}
