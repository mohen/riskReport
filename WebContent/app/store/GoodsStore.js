/*
*商品store
*/
Ext.define('keel.store.GoodsStore', {
    extend: 'Ext.data.Store',
    model: 'keel.model.GoodsModel',
    autoLoad: true,    
    proxy: {
        type: 'ajax',
        api: {
            read: 'app/goods.json' //只是一个数据接口,可以按需改变
        },
        reader: {
            type: 'json',
            root: 'results',
            successProperty: 'success'
        }
    }
});
