# WaitClassLibrary

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
    postEvent(dc.sde.post(bDebug1));
}
```
