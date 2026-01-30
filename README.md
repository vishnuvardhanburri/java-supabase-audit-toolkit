# Java-Supabase Audit Toolkit

This repository serves as a framework for auditing and optimizing Java backends integrated with Supabase. 

## Audit Strategy for "Vibe Session" Optimization:
1. **Type Hardening**: Replacing AI-generated loose types with strict Java POJOs to eliminate data hallucinations.
2. **Supabase Sync**: Verifying that Java Entity constraints match Postgres RLS (Row Level Security) policies.
3. **Checkstyle Integration**: Automated enforcement of industry-standard coding patterns.

## Performance Focus:
- Database connection pooling optimization for Supabase.
- Identifying and resolving N+1 query issues in "vibe" logic.
