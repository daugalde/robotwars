package shared;

/**
 *
 * @author David Ugalde
 */
public interface ISubject {
    
    public void attach(IObserver o);
    public void detach(IObserver o);
    public void notifyUpdate(int data);
}
