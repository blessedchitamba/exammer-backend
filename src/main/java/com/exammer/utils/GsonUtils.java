package com.exammer.utils;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class GsonUtils
{
	public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_INSTANT;

	private static Gson gson = new GsonBuilder().registerTypeAdapter(Instant.class, new JsonSerializer() {
		@Override public JsonElement serialize(Object o, Type type,
				JsonSerializationContext jsonSerializationContext)
		{
			return new JsonPrimitive(FORMATTER.format((TemporalAccessor) o));
		}
	}).setPrettyPrinting().serializeNulls().create();

	public static Gson getGson(){
		return gson;
	}
}
