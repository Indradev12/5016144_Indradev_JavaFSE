public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return Storage;
    }

    

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + Storage + "]";
    }



    public static class Builder {
        private String CPU;
        private String RAM;
        private String Storage;
    
        public Builder(String CPU) {
            this.CPU = CPU;
        }
    
        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }
    
        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }
    
        public Computer build() {
            return new Computer(this);
        }
    }
    
}

