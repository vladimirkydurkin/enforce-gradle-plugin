package org.fundacionjala.gradle.plugins.enforce.wsc.soap

import org.gradle.api.Project


class MetadataAPIParams {
	private static final String PARAM_ROLLBACK_ON_ERROR = 'deployRollbackOnError';
	private static final String PARAM_SINGLE_PACKAGE = 'deploySinglePackage';
	private static final String PARAM_ALLOW_MISSING_FILES = 'deployAllowMissingFiles';
	private static final String PARAM_PURGE_ON_DELETE = 'deployPurgeOnDelete';
	private static final String PARAM_IGNORE_WARNINGS = 'deployIgnoreWarnings';

	public Boolean RollbackOnError;
	public Boolean SinglePackage;
	public Boolean AllowMissingFiles;
	public Boolean PurgeOnDelete;
	public Boolean IgnoreWarnings;

	MetadataAPIParams(Project project) {
		init();
		parseParams(project);
	}

	private void parseParams(Project project) {
		if (project.project.hasProperty(PARAM_ROLLBACK_ON_ERROR))
			RollbackOnError = project.project.properties[PARAM_ROLLBACK_ON_ERROR].toBoolean();

		if (project.project.hasProperty(PARAM_SINGLE_PACKAGE))
			SinglePackage = project.project.properties[PARAM_SINGLE_PACKAGE].toBoolean();

		if (project.project.hasProperty(PARAM_ALLOW_MISSING_FILES))
			AllowMissingFiles = project.project.properties[PARAM_ALLOW_MISSING_FILES].toBoolean();

		if (project.project.hasProperty(PARAM_PURGE_ON_DELETE))
			PurgeOnDelete = project.project.properties[PARAM_PURGE_ON_DELETE].toBoolean();

		if (project.project.hasProperty(PARAM_IGNORE_WARNINGS))
			IgnoreWarnings = project.project.properties[PARAM_IGNORE_WARNINGS].toBoolean();
	}

	private void init() {
		RollbackOnError = true;
		SinglePackage = true;
		AllowMissingFiles = true;
		PurgeOnDelete = true;
		IgnoreWarnings = false;
	}
}