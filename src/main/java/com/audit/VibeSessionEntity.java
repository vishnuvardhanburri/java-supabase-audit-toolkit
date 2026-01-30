package com.audit;

import java.util.UUID;
import java.time.OffsetDateTime;

/**
 * Hardening Fix: Replacing loose JSON maps with a strict Entity.
 * This prevents data hallucinations between Java and Supabase.
 */
public class VibeSessionEntity {
    private UUID id;
    private String vibeType;
    private OffsetDateTime lastSync;
    private boolean isOptimized;

    // Strict getters/setters ensure data integrity
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
}
