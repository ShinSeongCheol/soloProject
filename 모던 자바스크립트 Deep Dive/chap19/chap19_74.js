const person = {
    name: 'Lee',
    address: 'Seoul',
    __proto__: {
        age: 20
    }
};

console.log(Object.entries(person));
Object.entries(person).forEach(([key, value]) => console.log(key, value));