package Composition;

    class Screen extends Product { // (8)
        private String resolution; // (9) e.g., "1080x2400"
        private double size;       // (10) inches

        // (11) Constructor
        public Screen(String model, String manufacturer, String resolution, double size) {
            super(model, manufacturer);
            this.resolution = resolution;
            this.size = size;
        }

        public void touchAt(int x, int y) {
            System.out.printf("Screen touched at (%d,%d)%n", x, y);
        }

        public String getResolution() { return resolution; }
        public double getSize() { return size; }
    }