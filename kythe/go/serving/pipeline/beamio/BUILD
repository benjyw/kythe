load("//tools:build_rules/shims.bzl", "go_library", "go_test")

package(default_visibility = ["//kythe:default_visibility"])

go_library(
    name = "beamio",
    srcs = ["entries.go"],
    deps = [
        "//kythe/go/storage/stream",
        "//kythe/proto:storage_go_proto",
        "@com_github_apache_beam//sdks/go/pkg/beam:go_default_library",
        "@com_github_apache_beam//sdks/go/pkg/beam/io/filesystem:go_default_library",
    ],
)

go_test(
    name = "entries_test",
    srcs = ["entries_test.go"],
    library = "beamio",
    deps = [
        "//kythe/go/platform/delimited",
        "@com_github_apache_beam//sdks/go/pkg/beam/io/filesystem/local:go_default_library",
        "@com_github_apache_beam//sdks/go/pkg/beam/testing/ptest:go_default_library",
        "@com_github_google_go_cmp//cmp:go_default_library",
    ],
)
