garbage-composite-annotation
============================

The --flatten compiler flag is used to recursively remove composites in a whole architecture.

The @Flatten annotation is used to recursively remove composites inside the targeted definition.
Two arguments can be used with the @Flatten annotation:
- "dumpADL=true" allows serializing the resulting ADL definition in the output folder, using the original definition name with a "_flat" suffix
- "dumpAnnotations=true" to be used with "dumpADL=true" serializes the propagated annotations, and can be considered experimental concerning annotated bindings, merged when going through a composition level
