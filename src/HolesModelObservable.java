public interface HolesModelObservable
{

    void announceLevelChange();

    void announceSoundStatusChange();

    void announceScoreChange();
    //
    // Announce to all observer of this object that the score has changed
    //

    void announceRedHolePositionChange();
    //
    // Announce to all observer of this object that the position of the red hole has
    // changed
    //

    void announceLivesRemainingChange();
    
    void announceHighScoresChange();

    void attach(HolesModelObserver anotherObserver);
    //
    // Subscribe anotherObserver as an observer of this object
    //

    void detach(HolesModelObserver currentObserver);
    //
    // Unsubscribe currentObserver as an observer of this object
    //

}