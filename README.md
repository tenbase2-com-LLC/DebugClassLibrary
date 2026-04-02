# DebugClassLibrary

## Setup

### Add DebugLibrary.jar to the JDE Project Classpath

Add the `DebugLibrary.jar` file to the JDE Project Classpath.

### Add the Import Statement

```java
import DebugLibrary.*;
```

### Add the DebugCapability to an Agent or Capability

```
#has capability DebugCapability dc;
```

### Add the SetDebug Code to the Agent

```java
public void SetDebug(boolean bDebug1)
{
    bDebug = bDebug1;
    postEvent(cap1.dc.sde.post(bDebug1));
}

public DebugBeliefSet GetDebugBeliefSet()
{
    return dc.debug;
}
```

### Add the Import to a JACK Plan

```java
import DebugLibrary.*;
```

### Add this to a JACK Plan Reasoning Method

```java
logical boolean $debug;
DebugBeliefSet debug = enc.GetDebugBeliefSet();
debug.get(0, $debug).next();

boolean bDebug = $debug.as_boolean();
```
