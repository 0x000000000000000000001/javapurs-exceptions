# purescript-exceptions

[![Latest release](http://img.shields.io/github/release/purescript/purescript-exceptions.svg)](https://github.com/purescript/purescript-exceptions/releases)
[![Build status](https://github.com/purescript/purescript-exceptions/workflows/CI/badge.svg?branch=master)](https://github.com/purescript/purescript-exceptions/actions?query=workflow%3ACI+branch%3Amaster)
[![Pursuit](https://pursuit.purescript.org/packages/purescript-exceptions/badge)](https://pursuit.purescript.org/packages/purescript-exceptions)

Exception effects.

## Installation

```
spago install exceptions
```

## Documentation

Module documentation is [published on Pursuit](http://pursuit.purescript.org/packages/purescript-exceptions).

## Java runtime

The Java FFI represents errors with `Throwable`. `error` and `errorWithCause`
use the name `Error`; `errorWithName` retains the supplied name in the stack
header. Empty names fall back to `Error` in `name`, while an empty custom name
omits the name in the header, matching JavaScript. Frames, causes and suppressed
exceptions use the JVM stack format.

`throwException` is deferred and preserves the original object, including checked
Java exceptions and `java.lang.Error`. `catchException` invokes the handler once;
failures from the handler itself propagate. See the
[exception contract](../javapurs/docs/ffi-runtime.md#exceptions).

From this checkout, with Node, a JDK and the neighboring Javapurs ports:

```bash
./bin/test-runtime
```

This runs 13 direct protocol checks and the JavaScript reference checks in an
isolated workspace. The
[integration suite](../javapurs/docs/testing.md#runtimes-ffi-et-interopérabilité)
also checks the PureScript APIs and exception identity through Aff and Promise,
with typed records/Maps and classes/standalone JARs. It additionally requires the
built backend, Spago and the TAST frontend. The
[M19 record](../javapurs/docs/testing.md#validation-m19) lists the JVM 17/26 results.
