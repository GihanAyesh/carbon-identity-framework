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

package org.wso2.carbon.identity.workflow.mgt.dto;

import org.wso2.carbon.identity.workflow.mgt.bean.Workflow;

public class Association {

    private String associationId;
    private String associationName;
    private String workflowName;
    private String workflowId;
    private String eventName;
    private String eventId;
    private String condition;
    private String eventCategory;
    private boolean enabled;

    private Association(AssociationBuilder associationBuilder){

        this.associationId = associationBuilder.associationId;
        this.associationName = associationBuilder.associationName;
        this.workflowName = associationBuilder.workflowName;
        this.workflowId = associationBuilder.workflowId;
        this.eventName = associationBuilder.eventName;
        this.eventId = associationBuilder.eventId;
        this.condition = associationBuilder.condition;
        this.eventCategory = associationBuilder.eventCategory;
        this.enabled = associationBuilder.enabled;
    }

    public Association(){

    }

    public String getAssociationId() {

        return associationId;
    }

    public void setAssociationId(String associationId) {

        this.associationId = associationId;
    }

    public String getAssociationName() {

        return associationName;
    }

    public void setAssociationName(String associationName) {

        this.associationName = associationName;
    }

    public String getEventName() {

        return eventName;
    }

    public void setEventName(String eventName) {

        this.eventName = eventName;
    }

    public String getEventId() {

        return eventId;
    }

    public void setEventId(String eventId) {

        this.eventId = eventId;
    }

    public String getCondition() {

        return condition;
    }

    public void setCondition(String condition) {

        this.condition = condition;
    }

    public String getWorkflowName() {

        return workflowName;
    }

    public void setWorkflowName(String workflowName) {

        this.workflowName = workflowName;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public static class AssociationBuilder{
        private String associationId;
        private String associationName;
        private String workflowName;
        private String workflowId;
        private String eventName;
        private String eventId;
        private String condition;
        private String eventCategory;
        private boolean enabled;

        public AssociationBuilder(){

        }

        public AssociationBuilder setAssociationId(String associationId) {
            this.associationId = associationId;
            return this;
        }

        public AssociationBuilder setAssociationName(String associationName) {
            this.associationName = associationName;
            return this;
        }

        public AssociationBuilder setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }

        public AssociationBuilder setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        public AssociationBuilder setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        public AssociationBuilder setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        public AssociationBuilder setCondition(String condition) {
            this.condition = condition;
            return this;
        }

        public AssociationBuilder setEventCategory(String eventCategory) {
            this.eventCategory = eventCategory;
            return this;
        }

        public AssociationBuilder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Association build() {
            return new Association(this);
        }

    }
}
