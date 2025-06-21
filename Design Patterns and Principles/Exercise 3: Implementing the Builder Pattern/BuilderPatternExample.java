public class BuilderPatternExample {
    public static void main(String[] args) {
        // basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        //high-end computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setPowerSupply("750W")
                .build();


        System.out.println("Basic Computer:");
        System.out.println(basicComputer);

        System.out.println("\nGaming Computer:");
        System.out.println(gamingComputer);
    }
}

class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String powerSupply;


    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.powerSupply = builder.powerSupply;
    }


    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String powerSupply;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "CPU: " + cpu + "\n" +
                "RAM: " + ram + "\n" +
                "Storage: " + (storage != null ? storage : "Not Specified") + "\n" +
                "Graphics Card: " + (graphicsCard != null ? graphicsCard : "Not Specified") + "\n" +
                "Power Supply: " + (powerSupply != null ? powerSupply : "Not Specified");
    }
}
