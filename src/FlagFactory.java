public  class FlagFactory {

    public static Flag flagFactory(String flagName){
        switch (flagName) {
            case "Israel":
                return new IsraelFalg();      
            default:
                return new IsraelFalg();
        }
    }

}
