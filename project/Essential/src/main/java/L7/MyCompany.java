package L7;

public enum MyCompany {
    Yakim( 1000 ) {
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        @Override
        public String getCurrency() {
            return "dolars";
        }
    },
    Google( 100 ) {
        @Override
        public String getCurrency() {
            return "cents";
        }
    },
    Starnet( 10 ) {
        @Override
        public String toString() {
            return "Company " + super.toString();
        }

        @Override
        public String getCurrency() {
            return "Euros";
        }
    };
    int value;

    MyCompany(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "company "+super.toString()+ ", salary " +getValue() +", "+getCurrency();
    }
    public int getValue() {
        return value;
    }
    public abstract String getCurrency();
}
