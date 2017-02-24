package org.openbakery.configuration

/**
 * Created by rene on 24.02.17.
 */
class ConfigurationFromMap implements Configuration {

	Map<String, Object> configurationMap = null

	ConfigurationFromMap(Map<String, Object> configurationMap) {
		if (configurationMap == null) {
			throw new IllegalArgumentException("given configuration map is null")
		}
		this.configurationMap = configurationMap
	}

	@Override
	Object get(String key) {
		return configurationMap[key]
	}

	@Override
	String getString(String key) {

		def value = configurationMap[key]
		if (value instanceof String) {
			return value
		}
		if (value instanceof Boolean) {
			return value.toString()
		}
		if (value instanceof Number) {
			return value.toString()
		}

		return null
	}

	@Override
	List<String> getStringArray(Object key) {
		def value = configurationMap[key]
		if (value instanceof List<String, Object>) {
			return value
		}
		return []
	}

	@Override
	Set<String> getKeys() {
		return configurationMap.keySet()
	}

	@Override
	boolean containsKey(String key) {
		return configurationMap.containsKey(key)
	}
}
