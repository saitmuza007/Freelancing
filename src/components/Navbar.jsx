import React from "react"
class Navbar extends React.Component
{
    render()
    {
        return(
            <div>
                 <header class="wrapper bg-light">
            <nav class="navbar navbar-expand-lg classic transparent navbar-light">
                <div class="container flex-lg-row flex-nowrap align-items-center">
                    <div class="navbar-brand w-100">
                        <a href="./index.html">
              <img src="./assets/img/upscale_logo_new@2x.png" srcset="./assets/img/upscale_logo_new@2x.png" alt="" />
            </a>
                    </div>
                    <div class="navbar-collapse offcanvas offcanvas-nav offcanvas-start">
                        <div class="offcanvas-header d-lg-none">
                            <h3 class="text-white fs-30 mb-0">UpScale</h3>
                            <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                        </div>
                        <div class="offcanvas-body ms-lg-auto d-flex flex-column h-100">
                            <ul class="navbar-nav">
                                <li class="nav-item ">
                                    <a class="nav-link " href="#" data-bs-toggle="dropdown">Home</a>
                                    
                                
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link" href="#" data-bs-toggle="dropdown">What We Do</a>
                                   
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link" href="#" data-bs-toggle="dropdown">Our Stratergy</a>
                                    
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link " href="#" data-bs-toggle="dropdown">FAQ</a>
                                  
                                </li>
                                
                                <li class="nav-item dropdown dropdown-mega">
                                    <a class="nav-link" href="#" data-bs-toggle="dropdown">Documentation</a>
                                    
                                    
                                </li>
                            </ul>
                            
                            <div class="offcanvas-footer d-lg-none">
                                <div>
                                    <a href="" class="link-inverse"><span class="__cf_email__" data-cfemail="ef86818980af8a828e8683c18c8082">[email&#160;protected]</span></a>
                                    <br /> 00 (123) 456 78 90 <br />
                                    <nav class="nav social social-white mt-4">
                                        <a href="#"><i class="uil uil-twitter"></i></a>
                                        <a href="#"><i class="uil uil-facebook-f"></i></a>
                                        <a href="#"><i class="uil uil-dribbble"></i></a>
                                        <a href="#"><i class="uil uil-instagram"></i></a>
                                        <a href="#"><i class="uil uil-youtube"></i></a>
                                    </nav>
                                    
                                </div>
                            </div>
                           
                        </div>
                      
                    </div>
                    
                    <div class="navbar-other ms-lg-4">
                        <ul class="navbar-nav flex-row align-items-center ms-auto">
                            <li class="nav-item d-none d-md-block">
                                <a href="./contact.html" class="btn btn-sm btn-primary rounded-pill">Login</a>
                            </li>
                            <li class="nav-item d-lg-none">
                                <button class="hamburger offcanvas-nav-btn"><span></span></button>
                            </li>
                        </ul>
                       
                    </div>
                  
                </div>
                
            </nav>
            
        </header>
            </div>
        );
    }
}
export default Navbar;