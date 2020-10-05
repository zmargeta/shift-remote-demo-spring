package hr.margeta.code.shiftremotedemo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record GreetingResource(Integer id, String message) {}
