# Java + Supabase Audit Toolkit

This repository contains the frameworks I use to audit and optimize Java backends integrated with Supabase.

### 🛡️ Audit Strategy:
* **Anti-Hallucination Layer**: Implementing strict POJOs/Records to replace loose JSON maps.
* **Schema Validation**: Ensuring Java entity constraints match Supabase PostgreSQL RLS policies.
* **Automated Quality Gate**: Using Checkstyle to enforce clean code standards.

### 📈 Database Improvements:
* Optimizing connection pooling for Supabase.
* Implementing proper indexing for high-frequency "vibe" sessions.
