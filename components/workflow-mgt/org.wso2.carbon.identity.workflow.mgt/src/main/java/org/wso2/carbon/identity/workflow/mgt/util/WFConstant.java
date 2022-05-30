/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.workflow.mgt.util;

import java.util.HashSet;
import java.util.Set;

public class WFConstant {

    public static final String REQUEST_ID = "REQUEST ID";

    public static final String HT_STATE_SKIPPED = "SKIPPED";
    public static final String HT_STATE_PENDING = "PENDING";

    public static final String KEYSTORE_SYSTEM_PROPERTY_ID = "javax.net.ssl.keyStore";
    public static final String KEYSTORE_PASSWORD_SYSTEM_PROPERTY_ID = "javax.net.ssl.keyStorePassword";
    public static final String KEYSTORE_CARBON_CONFIG_PATH = "Security.KeyStore.Location";
    public static final String KEYSTORE_PASSWORD_CARBON_CONFIG_PATH = "Security.KeyStore.Password";

    public static final String WORKFLOW_USER_ENTITY_TYPE = "USER";
    public static final String WORKFLOW_ADD_USER_REQUEST_TYPE = "ADD_USER";

    public static final int DEFAULT_RESULTS_PER_PAGE = 15;

    public static final String DEFAULT_FILTER = "*";

    public static final Set<Class> NUMERIC_CLASSES;

    static {
        NUMERIC_CLASSES = new HashSet<>();
        NUMERIC_CLASSES.add(Integer.class);
        NUMERIC_CLASSES.add(Long.class);
        NUMERIC_CLASSES.add(Short.class);
        NUMERIC_CLASSES.add(Character.class);
        NUMERIC_CLASSES.add(Byte.class);
        NUMERIC_CLASSES.add(Float.class);
        NUMERIC_CLASSES.add(Double.class);
    }

    public static class TemplateConstants {
        public static final String SERVICE_SUFFIX = "Service";

    }

    public static class ParameterName {
        //Template specific parameters
        public static final String WORKFLOW_NAME = "WorkflowName";
        public static final String ITEMS_PER_PAGE_PROPERTY = "ItemsPerPage";

    }
    public static class ParameterHolder {
        public static final String TEMPLATE = "Template" ;
        public static final String  WORKFLOW_IMPL = "WorkflowImpl" ;
    }

    public static class DBProductNames{
        public static final String MYSQL = "MySQL" ;
        public static final String MARIADB = "MariaDB" ;
        public static final String H2 = "H2" ;
        public static final String ORACLE = "Oracle" ;
        public static final String MICROSOFT = "Microsoft" ;
        public static final String POSTGRESQL = "PostgreSQL" ;
        public static final String DB2 = "DB2" ;
        public static final String INFORMIX = "INFORMIX" ;
    }

    public static class Exceptions{
        // Association errors
        public static final String ERROR_WHILE_LOADING_ASSOCIATIONS =  "Error while loading associations from DB: " +
                "Database driver could not be identified or not supported.";
        public static final String ERROR_LISTING_PAGINATED_ASSOCIATIONS_WITH_FILTER =  "Server error occurred when listing " +
                "paginated associations with filter";
        public static final String ERROR_LISTING_PAGINATED_ASSOCIATIONS =  "Server error occurred when listing " +
                "paginated associations";
        public static final String ERROR_LISTING_ASSOCIATIONS_WITH_FILTER =  "Server error occurred when listing " +
                "associations with filter: ";
        public static final String ERROR_LISTING_ASSOCIATIONS =  "Server error when listing associations";
        public static final String ERROR_GETTING_ASSOC_COUNT =  "Server error when getting the count of Associations";

        // Workflow errors
        public static final String ERROR_WHILE_LOADING_WORKFLOWS =  "Error while loading workflows from DB: " +
                "Database driver could not be identified or not supported.";
        public static final String ERROR_LISTING_PAGINATED_WORKFLOWS_WITH_FILTER =  "Server error occurred when listing " +
                "paginated workflows with filter";
        public static final String ERROR_LISTING_PAGINATED_WORKFLOWS =  "Server error occurred when listing " +
                "paginated workflows";
        public static final String ERROR_LISTING_WORKFLOWS_WITH_FILTER =  "Server error occurred when listing " +
                "workflows with filter: ";
        public static final String ERROR_LISTING_WORKFLOWS =  "Server error when listing workflows";
        public static final String ERROR_GETTING_WORKFLOW_COUNT =  "Server error when getting the count of workflows";

        public static final String ERROR_INVALID_PAGE_NUMBER =  "Invalid page number requested. The page number should "
                + "be a value greater than 0.";
    }
}
