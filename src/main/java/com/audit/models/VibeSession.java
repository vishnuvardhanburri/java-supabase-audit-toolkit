mkdir -p src/main/java/com/audit/models
cat <<EOF > src/main/java/com/audit/models/VibeSession.java
package com.audit.models;

import java.util.UUID;
import java.time.OffsetDateTime;

/**
 * AUDIT FIX: Preventing AI hallucinations by enforcing 
 * strict schema validation for Vibe Sessions.
 */
public record VibeSession(
    UUID id,
    String sessionName,
    OffsetDateTime createdAt,
    boolean isOptimized
) {}
EOF
