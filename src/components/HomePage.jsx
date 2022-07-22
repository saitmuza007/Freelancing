import React from "react";
class HomePage extends React.Component
{
    render()
    {
        return(
            <section class="wrapper bg-light">
            <div class="container pt-10 pt-md-14 pb-14 pb-md-16 text-center">
                <div class="row gx-lg-8 gx-xl-12 gy-10 gy-xl-0 mb-14 align-items-center">
                    <div class="col-lg-7 order-lg-2">
                        <figure><img class="img-auto" src="./assets/img/slides1.png" srcset="./assets/img/slides1.png" alt="" /></figure>
                    </div>
                 
                    <div class="col-md-10 offset-md-1 offset-lg-0 col-lg-5 text-center text-lg-start">
                        <h1 class="display-1 fs-54 mb-5 mx-md-n5 mx-lg-0 mt-7">
Hire the best freelancers <br class="d-md-none"/>for any <br class="d-md-none"/><span class="rotator-fade text-primary">Job Online</span></h1>
                        <p class="lead fs-lg mb-7">Connecting Millions Of Brains Virtually And Globally To provide Better Solutions In A Splendid Way.</p>
                        <span><a class="btn btn-lg btn-primary rounded-pill me-2">Hire Now</a></span>
                    </div>
                   
                </div>
                
                <p class="text-center mb-8">Developed with the finest technologies for an endured result</p>
                <div class="row row-cols-4 row-cols-md-4 row-cols-lg-7 row-cols-xl-7 gy-10 mb-2 d-flex align-items-center justify-content-center">
                    <div class="col"><img class="img-fluid px-md-3 px-lg-0 px-xl-2 px-xxl-5" src="./assets/img/brands/hrml.png" alt="" /></div>
                    <div class="col"><img class="img-fluid px-md-3 px-lg-0 px-xl-2 px-xxl-5" src="./assets/img/brands/reacts.png" alt="" /></div>
                    <div class="col"><img class="img-fluid px-md-3 px-lg-0 px-xl-2 px-xxl-5" src="./assets/img/brands/Mysql.png" alt="" /></div>
                    <div class="col"><img class="img-fluid px-md-3 px-lg-0 px-xl-2 px-xxl-5" src="./assets/img/brands/spring.png" alt="" /></div>
                    <div class="col"><img class="img-fluid px-md-3 px-lg-0 px-xl-2 px-xxl-5" src="./assets/img/brands/Firebase.png" alt="" /></div>
                    <div class="col"><img class="img-fluid px-md-3 px-lg-0 px-xl-2 px-xxl-5" src="./assets/img/brands/Java.png" alt="" /></div>
                    
                </div>
               
            </div>
            
            <div class="overflow-hidden">
                <div class="divider text-soft-primary mx-n2">
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 100">
            <path fill="currentColor" d="M1260,1.65c-60-5.07-119.82,2.47-179.83,10.13s-120,11.48-180,9.57-120-7.66-180-6.42c-60,1.63-120,11.21-180,16a1129.52,1129.52,0,0,1-180,0c-60-4.78-120-14.36-180-19.14S60,7,30,7H0v93H1440V30.89C1380.07,23.2,1319.93,6.15,1260,1.65Z" />
          </svg>
                </div>
            </div>
            </section>
         
        );
    }
}
export default HomePage;