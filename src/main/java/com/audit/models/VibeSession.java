package com.audit.models;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Audit Fix: Replacing unstructured Map objects with a strict POJO 
 * to prevent 'hallucinations' in the vibe session data layer.
 */
public class VibeSession {
    private UUID id;
    private String sessionName;
    private OffsetDateTime createdAt;
    private String rawAiOutput; // Hardening: specifically capturing raw data for auditing

    // Standard getters/setters show discipline
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    
    public String getSessionName() { return sessionName; }
    public void setSessionName(String name) { this.sessionName = name; }
}
