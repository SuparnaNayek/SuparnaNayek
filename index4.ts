import {GitHubApiService} from './GitHubApiService';
import { User } from './User';

console.log("hello");
let abc = new GitHubApiService();
abc.getUserInfo('koushikkothagal',(user: User) =>{
    console.log(user);
});


//API -> to retrieve some information from anyonline service. 