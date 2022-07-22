import React from "react";
class Need extends React.Component{
    render()
    {
        return(
            <div>
                       <section class="wrapper bg-gradient-primary">
            <div class="container pt-12 pt-lg-8 pb-14 pb-md-17">
                <div class="row text-center">
                    <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-2">
                        <h2 class="fs-16 text-uppercase text-primary mb-3">What We Do?</h2>
                        <h3 class="display-3 mb-10 px-xxl-10">The service we offer is specifically designed to meet your needs.</h3>
                    </div>
                </div>
                <div class="row gx-lg-8 gx-xl-12 gy-11 px-xxl-5 text-center d-flex align-items-end">
                    <div class="col-lg-4">
                        <div class="px-md-15 px-lg-3">
                            <figure class="mb-6"><img class="img-fluid" src="./assets/img/illustrations/1.svg" srcset="./assets/img/illustrations/1.svg " alt="" /></figure>
                            <h3>Web Development</h3>
                            <p class="mb-2">Nulla vitae elit libero, a pharetra augue. Donec id elit non mi porta gravida at eget. Fusce dapibus tellus.</p>
                            <a href="#" class="more hover">Learn More</a>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="px-md-15 px-lg-3">
                            <figure class="mb-6"><img class="img-fluid" src="./assets/img/illustrations/2.svg" srcset="./assets/img/illustrations/2.svg " alt="" /></figure>
                            <h3>Testing</h3>
                            <p class="mb-2">Maecenas faucibus mollis interdum. Vivamus sagittis lacus vel augue laoreet. Sed posuere consectetur.</p>
                            <a href="#" class="more hover">Learn More</a>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="px-md-15 px-lg-3">
                            <figure class="mb-6"><img class="img-fluid" src="./assets/img/illustrations/3.svg" srcset="./assets/img/illustrations/3.svg " alt="" /></figure>
                            <h3>Content/Analytics</h3>
                            <p class="mb-2">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Praesent commodo cursus magna scelerisque.</p>
                            <a href="#" class="more hover">Learn More</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
            </div>
        )
    }
}
export default Need;