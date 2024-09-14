public class Harbor {
    public static void main(String[] args) {
        Harbor Taichung = new Harbor();
        
        RiverBarge riverBarge = new RiverBarge();
        SeaPlane seaplane = new SeaPlane();
        
        Taichung.givePermissionToDock(riverBarge);
        Taichung.givePermissionToDock(seaplane);
    }

    private void givePermissionToDock(Sailer s) {
        s.dock();
    }
}
