Ext.onReady(function(){

	var store = new Ext.data.Store({
		proxy: new Ext.data.HttpProxy({
			url: 'getStates.json'
		}),
		reader: new Ext.data.JsonReader({
			root:'states'
		},
		[{name: 'code'}, 
		 {name: 'name'}
		])
	});

	var combo = new Ext.form.ComboBox({
		id: 'statesCombo',
		store: store,
		displayField: 'name',
		valueField: 'code',
		hiddenName : 'codeId',
		typeAhead: true,
		mode: 'local',
		fieldLabel: 'States of Brazil',
		anchor: '100%',
		forceSelection: true,
		triggerAction: 'all',
		emptyText:'Select a state...',
		selectOnFocus:true
	});

	var stateForm = new Ext.FormPanel({
		frame:true,
		url: 'saveState.json',
		title: 'Combo Box Example',
		bodyStyle:'padding:5px 5px 0',
		width: 250,
		labelAlign: 'top',
		layout: 'form',
		items: [combo]
	});
	
	store.load();
	
	stateForm.render(document.body);

});