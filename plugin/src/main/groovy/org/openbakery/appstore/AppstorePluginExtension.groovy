package org.openbakery.appstore

import org.gradle.api.Project

class AppstorePluginExtension {

	def String username = null
	def String password = null
	def String ascProvider = null

	public AppstorePluginExtension(Project project) {
	}
}
