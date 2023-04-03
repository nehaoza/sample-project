package com.sample.project.domain;

import io.soabase.recordbuilder.core.RecordBuilder;

@RecordBuilder
public record Person(String name, int age) {}
