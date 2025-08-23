public interface Reportable {
    public enum LOG_LEVEL {
        All,
        MEDIUM,
        MINIMAL,
        OFF
    }

    public void reportToSmartDashboard(LOG_LEVEL priority);
    public void initShuffleboard(LOG_LEVEL priority);
}
