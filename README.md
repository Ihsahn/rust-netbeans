# Rust NetBeans Plugin

A NetBeans plugin for [Rust](https://www.rust-lang.org).

| OSX | Linux | Windows |
| --- | ----- | ------- |
| ![OSX Build Status](https://img.shields.io/badge/build-passing%20on%20my%20laptop-brightgreen.svg) | [![Linux Build Status](https://travis-ci.org/drrb/rust-netbeans.svg?branch=master)](https://travis-ci.org/drrb/rust-netbeans) | [![Windows Build status](https://ci.appveyor.com/api/projects/status/ae0ci8qvmh5pawi1/branch/master?svg=true)](https://ci.appveyor.com/project/drrb/rust-netbeans/branch/master) |

## Requirements

* NetBeans 8.0.x (later NetBeans versions coming soon)
* Java 8+
* Rust
* Cargo
* Rustup

## Features

So far, it includes

* Cargo project support:
    * project view
    * clean/build/run/test from UI
* Highlighting:
    * syntax highlighting
* Editing:
    * brace matching
    * comment toggling
* Formatting:
    * auto-indentation
    * basic auto-formatting
* Testing UI:
    * run all tests
    * run module's tests
* Coming Soon:
    * error/warning highlighting
    * code completion
    * code folding
    * basic file overview
    * basic occurrence matching
    * basic variable renaming

## Installing

First, clone and build the plugin.

```console
git clone https://github.com/drrb/rust-netbeans.git
mvn package
```

You can then install the plugin from NetBeans (the plugin will have been packaged at `target/rust-netbeans-1.0.0-SNAPSHOT.nbm`).

## License

Rust NetBeans Plugin

Copyright (C) 2017 drrb

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
