package ua.com.phoneBook.model.entity;

/**
 * Created by danishevskyi on 8/4/17.
 */
public class Group {

    private enum Groups {FAMILY, WORK, FRIENDS, OTHER }
    private Groups groups;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws ClassCastException {
        this.description = description;
        selectGroup(this.description);
    }

    public void selectGroup(String description) throws NumberFormatException {

        int select = Integer.parseInt(description);
        switch (select){
            case 1:
                groups = Groups.FAMILY;
                break;
            case 2:
                groups = Groups.FRIENDS;
                break;
            case 3:
                groups = Groups.WORK;
                break;
            case 4:
                groups = Groups.OTHER;
                break;
        }
    }
}

