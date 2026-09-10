package com.cvmatcher.service.observer;

import com.cvmatcher.model.JobNotice;
import com.cvmatcher.model.MatchResult;
import com.cvmatcher.model.User;

/**
 * Observer pattern: decouples the scoring logic (MatchingService) from
 * whatever should happen when a user gets a high match (UI toast, log,
 * future email notification, etc).
 */
public interface MatchObserver {

    /**
     * Invoked when a candidate achieves a exceptionally high compatibility score 
     * with a specific job notice.
     *
     * @param user   The candidate (user) who achieved the high match.
     * @param notice The target job notice the candidate was matched against.
     * @param result The matching result containing the final score and breakdown details.
     */
    void onHighMatch(User user, JobNotice notice, MatchResult result);
}
