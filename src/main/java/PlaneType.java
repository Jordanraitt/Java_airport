public enum PlaneType {

    BOEING_737_600(120),
    BOEING_737_700(131),
    BOEING_737_800(181),
    AIRBUS_A321_200(198),
    AIRBUS_A320_200(168),
    AIRBUS_A340_313X(245),
    AIRBUS_A330_300(266),
    AIRBUS_A319_100(141),
    BOMBARDIER_CRJ900(88),
    ART_72_600(70),
    BOEING_BBJ1(86),
    AIRBUS_A320NEO(174);

    private final int value;

    PlaneType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
