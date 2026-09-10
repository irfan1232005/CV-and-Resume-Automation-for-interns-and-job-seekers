package com.cvmatcher.model;

/**
 * Represents the varying levels of access and authorization within the application.
 * Used to distinguish standard candidates from system administrators.
 */
public enum Role {

    /**
     * Standard user role. 
     * Typically assigned to job seekers who manage their CVs and apply to job notices.
     */
    USER,

    /**
     * Administrator role. 
     * Grants elevated privileges for system management, user management, and job notice administration.
     */
    ADMIN
}
