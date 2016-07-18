/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.rest.dmn.service.api.decision;

import org.activiti.dmn.engine.DmnRuleService;
import org.activiti.dmn.engine.RuleEngineExecutionResult;
import org.activiti.rest.dmn.service.api.DmnRestResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author Yvo Swillens
 */
public class BaseDecisionExecutorResource {

    @Autowired
    protected DmnRestResponseFactory dmnRestResponseFactory;

    @Autowired
    protected DmnRuleService dmnRuleService;

    protected RuleEngineExecutionResult executeDecisionByKeyAndTenantId(String decisionKey, String tenantId, Map<String, Object> inputVariables) {

        return dmnRuleService.executeDecisionByKeyAndTenantId(decisionKey, inputVariables, tenantId);
    }
}