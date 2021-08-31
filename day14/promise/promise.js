const promise = new Promise((resolve,reject)=>{
    setTimeout( ()=> {
        //resolve({user:"rohith"});
        reject(new Error("no user"))
    },3000)
});

promise
    .then(user => console.log(user))
    .catch(err=> console.log(err))