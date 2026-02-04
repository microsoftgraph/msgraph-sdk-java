# Gradle Wrapper Changes - Classpath Removal

## Overview

During the upgrade from Gradle 8.14.2 to Gradle 9.3.1, you may notice that the `CLASSPATH` variable and `-classpath` argument were removed from the Gradle wrapper scripts (`gradlew`, `gradlew.bat`, `android/gradlew`, and `android/gradlew.bat`).

**This is an intentional and expected change made by Gradle, not a mistake.**

## What Changed

### Before (Gradle 8.14.2 and earlier)
```bash
# In gradlew
CLASSPATH="\\\"\\\""  # Empty classpath with escaped quotes
# ... later, for Cygwin/MSYS:
CLASSPATH=$( cygpath --path --mixed "$CLASSPATH" )

# Command execution
java -classpath "$CLASSPATH" -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" "$@"
```

```batch
@rem In gradlew.bat
set CLASSPATH=

@rem Command execution
java -classpath "%CLASSPATH%" -jar "%APP_HOME%\gradle\wrapper\gradle-wrapper.jar" %*
```

**Note**: The CLASSPATH was actually empty in both cases, but was still being passed as an argument to Java.

### After (Gradle 9.3.1)
```bash
# In gradlew
# CLASSPATH variables removed

# Command execution
java -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" "$@"
```

```batch
@rem In gradlew.bat
@rem CLASSPATH variables removed

@rem Command execution
java -jar "%APP_HOME%\gradle\wrapper\gradle-wrapper.jar" %*
```

## Why Was This Changed?

### 1. Executable JAR Conversion
Starting with Gradle 8.14, the Gradle wrapper JAR (`gradle-wrapper.jar`) was updated to be a fully executable JAR with a `Main-Class` manifest entry. This means:
- The JAR can be run directly with `java -jar gradle-wrapper.jar`
- No need to manually specify the classpath or main class
- Simpler and more reliable execution

### 2. Benefits

#### Simplicity
- **Fewer moving parts**: Reduces the complexity of the wrapper script
- **Less error-prone**: Eliminates potential issues with classpath construction
- **Cleaner code**: More maintainable wrapper scripts

#### Cross-Platform Compatibility
- **Consistent behavior**: Works the same across all platforms and Java versions
- **Fewer escaping issues**: Avoids platform-specific path quoting/escaping problems
- **Standard Java practice**: Uses the industry-standard approach for running Java applications

#### Security and Maintainability
- **Reduced attack surface**: Simpler scripts are easier to audit and secure
- **Better maintainability**: Easier for Gradle team to maintain and improve
- **Future-proof**: Aligns with modern Java conventions

### 3. Technical Details

The old approach set an empty CLASSPATH variable and still used `-jar`:
```bash
# Old wrapper scripts
java -classpath "$CLASSPATH" -jar gradle-wrapper.jar [args...]
# The -classpath was redundant because -jar ignores the classpath anyway
```

The new approach removes the redundant classpath:
```bash
# New wrapper scripts  
java -jar gradle-wrapper.jar [args...]
```

**Important**: When you use `java -jar`, Java ignores any `-classpath` or `-cp` argument. The classpath is determined solely by the JAR's manifest `Class-Path` entry and the JAR itself. The old wrapper scripts were passing an empty classpath that was being ignored anyway.

The `gradle-wrapper.jar` manifest contains:
```
Main-Class: org.gradle.wrapper.GradleWrapperMain
```

This is why the simplification works - the classpath was never actually being used.

## Impact on This Project

When we upgraded to Gradle 9.3.1:
1. Updated `gradle/wrapper/gradle-wrapper.jar` (binary file)
2. Updated `gradle/wrapper/gradle-wrapper.properties` (version string)
3. Regenerated wrapper scripts (`gradlew` and `gradlew.bat`)
4. Applied the same changes to the Android subdirectory

The classpath removal was automatic when we ran:
```bash
./gradlew wrapper --gradle-version 9.3.1
```

## No Action Required

This change is:
- ✅ **Intentional**: Made by the Gradle project
- ✅ **Standard**: Part of the normal Gradle upgrade process
- ✅ **Safe**: Tested and used by millions of projects
- ✅ **Recommended**: Following Gradle best practices

If you see these changes in a diff or pull request, they are expected and should not be reverted.

## References

- [Gradle 9.3.1 Release Notes](https://docs.gradle.org/9.3.1/release-notes.html)
- [Upgrading within Gradle 8.x](https://docs.gradle.org/current/userguide/upgrading_version_8.html)
- [Upgrading within Gradle 9.x](https://docs.gradle.org/current/userguide/upgrading_version_9.html)
- [Gradle Wrapper Documentation](https://docs.gradle.org/current/userguide/gradle_wrapper.html)

## Related Changes in This PR

This classpath removal was part of a larger upgrade effort that included:
1. Gradle wrapper: 8.14.2 → 9.3.1 (root and android directories)
2. Android Gradle Plugin: 8.13.2 → 9.0.0
3. CI configuration updates to use JVM 17 for Gradle while maintaining Java 8 bytecode compatibility
4. Java compiler memory configuration for the java-8 build

See the PR description for complete details on all changes.
