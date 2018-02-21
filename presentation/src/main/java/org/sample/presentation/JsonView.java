// Copyright (c) 1998-2018 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.6.0
// ============================================================================
// CHANGE LOG
// CNT.6.0 : 2018-XX-XX, jam.hsu, creation
// ============================================================================

package org.sample.presentation;

import com.google.gson.Gson;

/**
 * @author jam.hsu
 *
 */
public class JsonView<M> implements View<JsonModel<M>> {
	
	private JsonModel<M> model;
	
    @Override
    public View<JsonModel<M>> setViewModel(JsonModel<M> model) {
    		this.model = model;
    		return this;
    }
    
    public String exportJson() {
    		Gson gson = new Gson();
    		String json = gson.toJson(model);
    		return json;
    }

}
