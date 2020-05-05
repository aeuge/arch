function profile_hist(){
    res = db.system.profile.aggregate([{$project: {'ms':{'$subtract':['$millis',{$mod:['$millis', 5]}]}}}, {$group:{_id:'$ms', sum:{$sum:1}}}, {$sort:{_id:1}}]);
    res.forEach(function(i) { print(i['_id'], '\t',i['sum']); });
}
