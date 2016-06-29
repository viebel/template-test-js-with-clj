# Rationale

`Clojurescript` provides powerful tools and semantics for testing code like `deftest` and `test.check` (generative testing).
This repository is a template for testing `javascript` code with `clojurescript` code.


# Structure

There is a `javascript` file `main.js` that defines a `javascript` function `foo`.

There is a `clojurescript` file `core_test.cljs` that tests `foo`.

![core_test.cljs](https://raw.githubusercontent.com/viebel/template-test-js-with-clj/master/images/clj-test-for-js.jpg)

In `project.clj`, `main.js` is defined as a `:foreign-libs`, so we can `:require` it from `clojurescript`.

Simple, no?

# How to run
```bash
lein doo phantom test
```

Modify the code of the test inside `src/js_test_in_cljs/test/core_test.cljs` and the tests re-run automatically in under 1 second.                                              


