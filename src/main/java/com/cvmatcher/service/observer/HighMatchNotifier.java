package com.cvmatcher.service.observer;

import com.cvmatcher.model.JobNotice;
import com.cvmatcher.model.MatchResult;
import com.cvmatcher.model.User;

/**
 * Simplest concrete observer: logs the high-match event to the console.
 * In the JavaFX UI, this can be swapped or extended for a toast notification
 * or badge update without the MatchingService knowing or caring.
 */
public class HighMatchNotifier implements MatchObserver {

    private static final String NOTIFICATION_FORMAT = "[notification] %s: strong match with %s at %s (score=%.2f)%n";

    /**
     * Triggers a notification when a high match score is detected between a user and a job notice.
     *
     * @param user   The user (candidate) who achieved a high match.
     * @param notice The job notice that the user matched with.
     * @param result The result object containing the match score and other details.
     */
    @Override
    public void onHighMatch(final User user, final JobNotice notice, final MatchResult result) {
        System.out.printf(
                NOTIFICATION_FORMAT,
                user.getFullName(),
                notice.getTitle(),
                notice.getCompany(),
                result.getScore()
        );
    }
}
