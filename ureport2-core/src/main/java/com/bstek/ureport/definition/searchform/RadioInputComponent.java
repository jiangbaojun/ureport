/*******************************************************************************
 * Copyright 2017 Bstek
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.bstek.ureport.definition.searchform;

import java.util.List;

/**
 * @author Jacky.gao
 * @since 2017年10月23日
 */
public class RadioInputComponent extends InputComponent {
	private boolean optionsInline;
	private List<Option> options;
	@Override
	String inputHtml(RenderContext context) {
		StringBuilder sb=new StringBuilder();
		String name=getBindParameter();
		sb.append("<div>");
		for(Option option:options){
			if(this.optionsInline){
				sb.append("<label class='checkbox-inline' style='padding-left:0px'><input value='"+option.getValue()+"' type='radio' name='"+name+"'> "+option.getLabel()+"</label>");
			}else{
				sb.append("<label class='checkbox'><input value='"+option.getValue()+"' type='radio' name='"+name+"' style='margin-left: auto'> "+option.getLabel()+"</label>");
			}
		}
		sb.append("</div>");
		return sb.toString();
	}
	@Override
	public String initJs(RenderContext context) {
		return "";
	}
	public void setOptionsInline(boolean optionsInline) {
		this.optionsInline = optionsInline;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	@Override
	public String toHtml(RenderContext context) {
		StringBuilder sb=new StringBuilder();
		return sb.toString();
	}
}
