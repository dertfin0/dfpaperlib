package ru.dfhub;

class InitializationException extends RuntimeException {
    public InitializationException(String message) {
        super("DFPaperLib not initialized!");
    }

    protected static void check() {
        if (DFPaperLib.PLUGIN == null) {
            throw new InitializationException("DFPaperLib not initialized!");
        }
    }
}
