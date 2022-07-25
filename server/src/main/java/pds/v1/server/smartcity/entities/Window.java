package pds.v1.server.smartcity.entities;

public class Window {
    private Long id;
    private int floorStage;
    private boolean isOpen;

    private Building building;

    public Window() {
    }

    public Window(Long id, int floorStage, boolean isOpen) {
        this.id = id;
        this.floorStage = floorStage;
        this.isOpen = isOpen;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFloorStage() {
        return this.floorStage;
    }

    public void setFloorStage(int floorStage) {
        this.floorStage = floorStage;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
