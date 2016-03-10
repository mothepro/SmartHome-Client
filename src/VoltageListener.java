/**
 * Event callable interface
 */
public interface VoltageListener {
    void onBlock();
    void onUnblock();
    void onChange(boolean b); // true if blocked
}
