package com.github.j2objccontrib.disk;

import com.google.common.base.Optional;

public interface SimpleStore {
    void store(String name, String value);

    Optional<String> read(String name);
}
