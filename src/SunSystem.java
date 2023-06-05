public enum SunSystem {
    MERCURY(1, 2440, 1, null ),
    VENUS(2, 6052, 20, MERCURY),
    EARTH (3,6371,30,VENUS),
    MARS (4,3390,40,EARTH),
    JUPITER(5,69911,50,MARS),
    SATURN(6,58232,60,JUPITER),
    URANUS (7,25362,60,SATURN),
    NEPTUNE(8,24622,80,URANUS);
    private final int numFromSun;
    private final int radiusPlanet;
    private final int distanceToPrevPlanet;
    private final String prevPlanet;
    private final int distanceToSun;
    private final int initValue = 0;

    SunSystem(Integer numFromSun, Integer radiusPlanet, Integer distanceToPrevPlanet, SunSystem prevPlanet) {
        this.numFromSun = numFromSun;
        this.radiusPlanet = radiusPlanet;
        this.distanceToPrevPlanet = distanceToPrevPlanet;
        this.prevPlanet = getPrevPlanet();
        this.distanceToSun = prevPlanet != null ? prevPlanet.distanceToSun + distanceToPrevPlanet : initValue;
    }
    public int getNumFromSun() {
        return numFromSun;
    }
    public int getRadiusPlanet() {
        return radiusPlanet;
    }
    public int getDistanceToPrevPlanet() {
        return distanceToPrevPlanet;
    }
    public String getPrevPlanet() {
        return prevPlanet;
    }
    public int getDistanceToSun() {
        return distanceToSun;
    }
}
