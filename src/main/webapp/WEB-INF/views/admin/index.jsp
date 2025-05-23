<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Dashboard Admin</title>
    <%@include file="../decorator/meta/AdminHead.jsp"%>
  </head>
  <body class="sb-nav-fixed">
    <%@include file="../decorator/header/AdminHeader.jsp"%>

    <div id="layoutSidenav">
      <%@include file="../decorator/sidebar/sidebar.jsp"%>

      <div id="layoutSidenav_content">
        <main>
          <div class="container-fluid px-4">
            <h1 class="mt-4">Dashboard Manage</h1>
            <ol class="breadcrumb mb-4">
              <li class="breadcrumb-item active">Dashboard</li>
            </ol>
            <div class="row">
              <div class="col-xl-3 col-md-6">
                <div class="card bg-primary text-white mb-4">
                  <div class="card-body">Manage Users</div>
                  <div
                    class="card-footer d-flex align-items-center justify-content-between"
                  >
                    <a class="small text-white stretched-link" href="#"
                      >View Details</a
                    >
                    <div class="small text-white">
                      <i class="fas fa-angle-right"></i>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-xl-3 col-md-6">
                <div class="card bg-warning text-white mb-4">
                  <div class="card-body">Top Categories</div>
                  <div
                    class="card-footer d-flex align-items-center justify-content-between"
                  >
                    <a class="small text-white stretched-link" href="#"
                      >View Details</a
                    >
                    <div class="small text-white">
                      <i class="fas fa-angle-right"></i>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-xl-3 col-md-6">
                <div class="card bg-success text-white mb-4">
                  <div class="card-body">Top Anime</div>
                  <div
                    class="card-footer d-flex align-items-center justify-content-between"
                  >
                    <a class="small text-white stretched-link" href="#"
                      >View Details</a
                    >
                    <div class="small text-white">
                      <i class="fas fa-angle-right"></i>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-xl-3 col-md-6">
                <div class="card bg-danger text-white mb-4">
                  <div class="card-body">Recycle Bin</div>
                  <div class="card-footer d-flex align-items-center justify-content-between">
                    <a class="small text-white stretched-link" href="#">View Details</a>
                    <div class="small text-white">
                      <i class="fas fa-angle-right"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <div class="card mb-4">
              <div class="card-header">
                <i class="fas fa-table me-1"></i>
                All Anime Data
                <a class="btn btn-primary align-content-lg-start mx-3" href="#">Add new +</a>
              </div>
              <div class="card-body">
                <table id="datatablesSimple">
                  <thead>
                    <tr>
                        <th>Thumbnail</th>
                      <th>Name</th>
                      <th>All seasons</th>
                      <th>Country</th>
                      <th>Categories</th>
                      <th>Tags</th>
                      <th>Release year</th>
                      <th>Upload date</th>
                      <th>Edit</th>
                      <th>Delete</th>
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                    <th>Thumbnail</th>
                      <th>Name</th>
                      <th>All seasons</th>
                      <th>Country</th>
                      <th>Categories</th>
                      <th>Tags</th>
                      <th>Release year</th>
                      <th>Upload date</th>
                      <th>Edit</th>
                      <th>Delete</th>
                    </tr>
                  </tfoot>
                  <tbody>
                    <c:forEach items="${film}" var="x">
                      <tr>
                        <td><img src="${x.thumbnail}" width="50vh" alt="" srcset=""></td>
                        <td>${x.name}</td>
                        <td>${x.seasons.size()}</td>
                        <td>${x.country.name}</td>
                        <td>
                          <c:forEach items="${x.categories}" var="category">
                            ${category.name},
                          </c:forEach>
                        </td>
                        <td>
                          <c:forEach items="${x.tags}" var="tag">
                            ${tag.tag},
                          </c:forEach>
                        </td>
                        <td>${x.releaseYear}</td>
                        <td>${x.uploadDate}</td>
                        <td><a href="#">Edit</a></td>
                        <td><a href="#">Delete</a></td>
                      </tr>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </main>

        <%@include file="../decorator/footer/AdminFooter.jsp"%>
      </div>
    </div>

    <%@include file="../decorator/script/AdminScript.jsp"%>
  </body>
</html>
